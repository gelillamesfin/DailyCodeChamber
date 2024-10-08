const wordPattern = function (pattern, s) {
  let words = s.split(" ");

  if (pattern.length !== words.length) {
    return false;
  }
  const charToWord = new Map();
  const wordToChar = new Map();
  for (let i = 0; i < pattern.length; i++) {
    const char = pattern[i];
    let word = words[i];

    if (!charToWord.has(char) && !wordToChar.has(word)) {
      charToWord.set(char, word);
      wordToChar.set(word, char);
    } else {
      if (charToWord.get(char) !== word || wordToChar.get(word) !== char) {
        return false;
      }
    }
  }

  return true;
};
