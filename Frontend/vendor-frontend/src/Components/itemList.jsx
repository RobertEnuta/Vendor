import React, { Component } from 'react'
import itemService from '../services/itemService';
import { Card, CardGroup } from 'react-bootstrap';
import { Button } from 'react-bootstrap';
import bayo from '../images/test1.jpg';
import { Row } from 'react-bootstrap';
import { Link } from "react-router-dom";
import productService from '../services/productService';
import ProductPage from '../pages/Product';


export default class ListItems extends Component {
    constructor(props){
        super(props);

        this.state = {
            items: []
        }

    }

    componentDidMount(){
        itemService.getItems().then((res) => {
            this.setState({ items: res.data});
        });
    }
   

    render() { 
        var itemId = 0;
        return (
            <div>
                <h2 className="text-center">Products</h2>
                <div className="row">
                    <table className="table table-striped table-bordered">
                        <thead>
                        </thead>
                        <body>
                        <Row xs={1} md={3} className="g-4">
                            {
                                this.state.items.map
                                (
                                    item =>
                                    <ul key = {item.id}>
                                        <li class="product">    
                                            {itemId = item.id}                                      
                                            <Card style={{ width: '20rem', height: '30rem' }}>
                                                <Card.Img variant="bottom" src={bayo}/>
                                                <Card.Body>
                                                    <Card.Title>
                                                        <div class="name">
                                                            {item.name} 
                                                        </div>  
                                                    </Card.Title>
                                                    <Card.Text>
                                                        <div class="description">
                                                            {item.description} 
                                                        </div>
                                                        <p></p>
                                                        <div class="date"> 
                                                            {item.uploadDate}
                                                        </div>      
                                                    </Card.Text>
                                                    <div class="price"> 
                                                        <Link to="/product" class="">
                                                        <Button variant="primary" onClick={() => {ProductPage(item.id)}}>View listing</Button></Link>{item.price}€ 
                                                    </div> 
                                                </Card.Body>
                                            </Card>
                                        </li>
                                    </ul>
                                )
                            }
                        </Row>
                        </body>
                    </table>
                </div>
            </div>
        )
    }
}
