import React from 'react';
import DisplayItem from '../Components/itemDisplay';
import { Card, CardGroup, ListGroupItem, ListGroup, Button } from 'react-bootstrap';
import bayo from '../images/test1.jpg';
import productService from '../services/productService';

function ProductPage(id) {
  var productId;
  document.title = "productName";
  return (
    <div className="container">
      <br />
       <Card >
         <Card.Img variant="top" src={bayo} />
        <Card.Body>
         <Card.Title>Product Name</Card.Title>
          <Card.Text>
      </Card.Text>
    </Card.Body>
    <ListGroup className="list-group-flush">
      <ListGroupItem>Price:</ListGroupItem>
      <ListGroupItem>User:</ListGroupItem>
      <ListGroupItem>Description:</ListGroupItem>
    </ListGroup>
    <Card.Body>
    </Card.Body>
  </Card>
      <DisplayItem />
    </div>
  );

}


export default ProductPage;
