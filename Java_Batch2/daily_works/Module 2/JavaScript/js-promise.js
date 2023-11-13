let count = 5;
promise = new Promise
(
    (resolve,reject) =>
    {
        if(count)
        resolve('promise Resolved')
        else
        reject('Invalid count value')
    }
)
promise.then((msg) => {
console.log(msg)
}).then(() => console.log('Done'))
.catch(error => console.error(error))
.finally(() => console.log('Execution completed'))