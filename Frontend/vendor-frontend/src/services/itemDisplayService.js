import axios from 'axios';

const ITEM_API_BASE_URL = "http://localhost:8080/products/";

class ItemDisplayService{
    getItem(id){
        var url = ITEM_API_BASE_URL + id.value;
        return axios.get(url);
    }
}
 
export default new ItemDisplayService();