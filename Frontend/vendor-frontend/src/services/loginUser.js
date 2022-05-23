import axios from 'axios';

const login_API_BASE_URL = "http://localhost:8080/auth/login";

class loginService{
    Auth(username, password){
        return axios.post(login_API_BASE_URL,{username: username, 
            password: password 
        })
        .then((response) => {
            if (response.status === 200) {
                if(response.data.message) {
                    console.log(response.data);
                    alert(response.data.message);
                } else {
                    console.log(response.data);
                    localStorage.setItem('accessToken', response.data.token)
                    localStorage.setItem('uid', response.data.id)
                    localStorage.setItem('role', response.data.roles);
                    localStorage.setItem('username', response.data.username);
                    localStorage.setItem("email", response.data.email);
                }
            }
        });
    };
}
 
export default new loginService();