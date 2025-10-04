//
// This is only a SKELETON file for the 'Reverse String' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const reverseString = (word) => {
  let size = word.length -1;
  let reverse_word = '';
  for (let i = size; i >= 0; i--) {
    reverse_word += word[i];
  }
  return reverse_word;
};
