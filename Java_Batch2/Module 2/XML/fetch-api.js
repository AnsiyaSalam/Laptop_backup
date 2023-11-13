const fetch = require('node-fetch')





// async function fetchUser(username){}

const fetchUser = async (username) => {

    let response = await fetch('https://api.githud.com/users/' + username);

    if (response.status === 200) {

        let data = await response.json()

        console.log(data)

    }

    else {

        return {
            status: response.status,

            error: response.statusText

        }

    }

}



fetchUser('ramadx').then(response => console.log(response))

    .catch(error => console.error(error))