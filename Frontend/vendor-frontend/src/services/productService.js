import axios from 'axios';

const ITEM_API_BASE_URL = "http://localhost:8080/products/";

class ProductService{
    getProduct(id){
        return axios.get(ITEM_API_BASE_URL + id).then((response)=> {
            localStorage.setItem("name",response.data.name);
            localStorage.setItem("description",response.data.description);
            localStorage.setItem("price",response.data.price);
            localStorage.setItem("images",response.data.images);
            localStorage.setItem("uploadDate",response.data.uploadDate);
        });
    }
}
 
export default new ProductService();