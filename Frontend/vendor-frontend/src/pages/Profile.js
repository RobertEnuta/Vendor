import React from 'react';
import { Card, CardGroup, ListGroupItem, ListGroup, Button } from 'react-bootstrap';
import { Link } from "react-router-dom";

function Profile() {
  if(localStorage.getItem("username")){
    return (
      <div className="container">
        <br />
        <Card >
    <Card.Body>
      <Card.Title>User Profile</Card.Title>
      <Card.Text>
        Here is a list of information about your account:
      </Card.Text>
    </Card.Body>
    <ListGroup className="list-group-flush">
      <ListGroupItem>Username: {localStorage.getItem("username")}</ListGroupItem>
      <ListGroupItem>Email: {localStorage.getItem("email")}</ListGroupItem>
      <ListGroupItem>Roles: {localStorage.getItem("role")}</ListGroupItem>
    </ListGroup>
    <Card.Body>
    <Link to="/login">
      <Button onClick={() => {localStorage.clear()}, () => {alert("You have been disconnected!")}}>Disconnect</Button></Link>
    </Card.Body>
  </Card>
      </div>
    );
  } else {
    return (
      <Card > 
      <Card.Body>
      <Card.Title>User Profile</Card.Title>
      <Card.Text>
        You need to login or register first to check your account!
      </Card.Text>
    </Card.Body>
    </Card>
    );
  }


}


export default Profile;
