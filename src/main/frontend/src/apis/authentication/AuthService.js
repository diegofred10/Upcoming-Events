import AuthConnection from "./AuthConnection";


export default class AuthService {

    #conn;

    constructor() {
        this.#conn = new AuthConnection();
    }

async login(userName, password){
    return await this.#conn.login(userName, password);
    
}

}


