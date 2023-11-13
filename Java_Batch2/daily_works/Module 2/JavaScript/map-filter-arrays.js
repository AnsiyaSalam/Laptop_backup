let arr = [10,20,30,40,50,60,70,80]

// filtering data
// find all the elements which are multiple of 20

let arr20s = arr.filter(e => e % 20 == 0)
console.log(arr20s)

// find an element

let arr30s = arr.find(e => e % 30 == 0)
console.log(arr30s)

// applying some chnages to the elements

let arr10 = arr.map(e => e / 10)
console.log(arr10)

// count sum reduce

let count20s = arr.filter(e => e % 20 == 0).length
console.log(count20s)

// find all the sum of the elements

let sum = arr.reduce((x,y) => x + y).toFixed()
console.log(sum)

let sum2 = arr.concat()
console.log(sum2)

let names = ['Sidharth','Ansiya','Rohith']
names.sort()
console.log(names)

// using set and map

let set = new Set([10,20,10,30,10,40])
set.add(100)
console.log(set)

// map in javascript

let map = new Map()
map.set(1,'Sidhu')
map.set(2,'Ansi')
map.set(3,'Ashz')
console.log(map)
console.log(map.get(2))