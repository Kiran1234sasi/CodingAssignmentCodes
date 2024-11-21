function sortArrayDescending(arr) {
    let n = arr.length;
    let swapped;

    for (let i = 0; i < n - 1; i++) {
        swapped = false; 

        for (let j = 0; j < n - i - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                let temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
    }
}

let numbers = [9,6,13,3,16,10,7];

console.log("Before sorting an array :", numbers);

sortArrayDescending(numbers);

console.log("Sorted array in descending order:", numbers);