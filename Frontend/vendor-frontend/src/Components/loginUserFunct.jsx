
import loginService from "../services/loginUser"

export default function loginUser(username,password){
    if (!username || !password){
        alert("Please type in all the fields.");
    } else {
        alert("Logged in as: " + username + "!");
    }

    return loginService.Auth(username,password);
}
