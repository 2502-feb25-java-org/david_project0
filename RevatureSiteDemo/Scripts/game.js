// assigns canvas selection to a variable for reuse

var cvs = document.getElementById("canvas");
var ctx = cvs.getContext("2d");

// load images -- create objects and assign location of images

var bird = new Image();
var bg = new Image();
var fg = new Image();
var pipeNorth = new Image();
var pipeSouth = new Image();

bird.src = "images/mcycle.png";
bg.src = "images/city.png";
fg.src = "images/screen.png";
pipeNorth.src = "images/pipeNorth.png";
pipeSouth.src = "images/pipeSouth.png";


// some variables

var gap = 85;
var constant;

// toggles the end game alert message
let gameEnd = false;
var bX = 10;
var bY = 150;

var gravity = .75;

var score = 0;

// audio files

var fly = new Audio();
var scor = new Audio();

fly.src = "";
scor.src = "";

// on key down

document.addEventListener("keydown",moveUp);

function cover(){
    canvas.style.display="none";
}

function show(){
    canvas.style.display="contents";
}
function moveUp(){
    bY -= 25;
    fly.play();
}

function credentials(){

}

// pipe coordinates

var pipe = [];

pipe[0] = {
    x : cvs.width,
    y : 0
};

// draws images in canvas

function draw(){
    
        ctx.drawImage(bg,0,0);
    
    
    for(var i = 0; i < pipe.length; i++){
        
        constant = pipeNorth.height+gap;
        ctx.drawImage(pipeNorth,pipe[i].x,pipe[i].y);
        ctx.drawImage(pipeSouth,pipe[i].x,pipe[i].y+constant);
        
        //draws the pipes along the x-axis
        pipe[i].x--;
        //pipe[i].y++;
        
        if( pipe[i].x == 125 ){
            pipe.push({
                x : cvs.width,
                y : Math.floor(Math.random()*pipeNorth.height)-pipeNorth.height
            }); 
        }

        // detect collision
        /* floor and ceiling
        *  pipe obstacles 
        *  determines if the coordinates of the pipes, floor or ceiling are being entered by the motorcycle
        */ 
        
        if( bX + bird.width >= pipe[i].x && bX <= pipe[i].x + pipeNorth.width && (bY <= pipe[i].y + pipeNorth.height || bY+bird.height >= pipe[i].y+constant) || bY + bird.height >=  cvs.height - fg.height){
           
           if(!gameEnd){
               alert("You have crashed! Be sure to wear a helmet!")
               gameEnd = true;
           }
            location.reload(); // reload the page
        }
        
        if(pipe[i].x == 5){
            score++;
            scor.play();
        }
        
        
    }

    ctx.drawImage(fg,0,cvs.height - fg.height);
    
    ctx.drawImage(bird,bX,bY);
    
    bY += gravity;
    
    ctx.fillStyle = "#000";
    ctx.font = "20px Verdana";
    ctx.fillText("Score : "+score,10,cvs.height-20);
    
    requestAnimationFrame(draw);
    
}

draw();