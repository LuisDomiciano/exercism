//
// This is only a SKELETON file for the 'Raindrops' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const convert = (number) => {
  let raindrop = "";
  
  if (number % 3 == 0) raindrop += "Pling";
  if (number % 5 == 0) raindrop += "Plang";
  if (number % 7 == 0) raindrop += "Plong";
  
  return raindrop.length == 0 ? number.toString() : raindrop;
};
