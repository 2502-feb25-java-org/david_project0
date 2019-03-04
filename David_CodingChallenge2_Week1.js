// Sort array of integers

// f([2,4,5,1,3,1]) = [1,1,2,3,4,5]

// //challenge.sort = function(array) 

function arraySorter(arr) {

    for (let i in arr) {
        for (let j = 0; j < arr.length; j++) {
            if (arr[j] > arr[j + 1]) {
                let test = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = test;
            }
        }
    }
    return arr;
};
let ans = arraySorter([2, 4, 5, 1, 3, 1]);
console.log(ans);
