const prompt = require("prompt-sync")();

function reverseWordInSentence(sentence) {
        let words = sentence.split(" ");
    
    let reversedWords = words.map(word => {
        return word.split("").reverse().join("");
    });
    return reversedWords.join(" ");
}
const input = prompt("Enter a sentence:");

const result = reverseWordInSentence(input);

console.log("Reversed words:", result);