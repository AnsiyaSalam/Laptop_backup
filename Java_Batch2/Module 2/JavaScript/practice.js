    //Reversing an array

const reverse = (array) => {
    const reversedArray = [];
    for (let i = array.length - 1; i >= 0; i--) {
      reversedArray.push(array[i]);
    }
    return reversedArray;
  };
  
  const data = [1, 2, 3];
  console.log(reverse(data));
