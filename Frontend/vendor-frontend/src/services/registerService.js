import axios from 'axios';

const register_API_BASE_URL = "http://localhost:8080/auth/register";

class registerService{
    Auth(username,password,email,role){
        return axios.post(register_API_BASE_URL,{
            username: username,
            password: password,
            email: email,
            role: [role]
        }).then((response) => {
            if (response.status === 200) {
                if(response.data.message) {
                    console.log(response.data);
                    alert(response.data.message);
                }
            } else {
                alert(response.data.message);
            }
        });
    }
}
 
export default new registerService();