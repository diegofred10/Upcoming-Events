import axios from 'axios'
export default class AuthConnection {

    baseUrl = "http://localhost:8080";
    #auth = "";
    
   

    async login (username, password) {
        this.auth = this.encoderB64(username, password);
        
        console.log(this.auth);
            const myHeaders = new Headers();
            myHeaders.append("Authorization", `Basic ${this.#auth}`);
      

            const response = axios.get(this.baseUrl+'/api/login', {
                auth:{
                    username: username,
                    password: password
                }
                })
            
             console.log((await response).status);
        }
        encoderB64(username, password) {
            const encodedData = window.btoa(`${username}:${password}`)
            return encodedData
        }
    }
