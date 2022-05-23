import { Component } from "react";
import "../Styles/navbar.css";
import { NavLink } from "react-bootstrap";
import { Nav } from "react-bootstrap";
import { Container } from "react-bootstrap";
import { Navbar } from "react-bootstrap";
import { Link } from "react-router-dom";


export default class NavBar extends Component {


    render() {
        return (
            <Navbar bg="dark" variant="dark">
                <Container>
                    <Navbar.Brand href="/">Vendor</Navbar.Brand>
                    <Nav className="me-auto">
                        <Link to="/" className="link">Home</Link>
                        <Link to="/items" className="link">Products</Link>
                        <Link to="/profile" className="link">Profile</Link>
                    </Nav>

                    <Link to="/register" className="link">Register</Link>
                    <Link to="/login" className="link">Login</Link>
                </Container>
            </Navbar>
        )
    }
}


