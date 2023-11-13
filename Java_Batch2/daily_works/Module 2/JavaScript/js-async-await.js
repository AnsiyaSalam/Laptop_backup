let callMe = async function(count)
{
    if(count)
    return Promise.resolve('Count is Ok.')
    else
    return Promise.reject('Not acceptable')
}

let greet = async() =>{
    await callMe(10).then((msg) => 
    console.log(msg))
    console.log('Greetings..')

}
greet()

// callMe(0).then((msg) => {
//     console.log(msg)
//     }).then(() => console.log('Done'))
//     .catch(error => console.error(error))
//     .finally(() => console.log('Execution completed'))