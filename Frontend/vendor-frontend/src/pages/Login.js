import React,{ Component } from 'react';
import "../Styles/log.css";
import Button from 'react-bootstrap/Button';
import InputTextBox from '../Components/InputTextBox';
import loginUserFunct from "../Components/loginUserFunct";
import { Link } from "react-router-dom";
import {useState} from "react";

function Login() {
    document.title ="Login";
    var [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const handleUsernameChange = (e) => {
        e.preventDefault();

        setUsername(e.target.value);
    };
    const handlePasswordChange = (e) => {
        e.preventDefault();

        setPassword(e.target.value);
    };
    return (
        <div>
            <div className="form">
                <div className="title">Login</div>
                User Name
                <p />
                <input
                    className="login-input"
                    onChange={handleUsernameChange}
                    placeholder="Username"
                    value={username}
                    type="username"
                    required
                />
                {/* <InputTextBox value={username} type="username" onChange={handleUsernameChange} placeholder="Username"/> */}
                <br />
                Password
                <p />
                <input
                    className="login-input"
                    onChange={handlePasswordChange}
                    placeholder="Password"
                    value={password}
                    type="password"
                    required
                />
                <p />
                {/* <InputTextBox value={password} type="password" onChange={handlePasswordChange} placeholder="Password"/>  */}
                <Link to="/">
                <Button className="button" variant="outline-secondary" id="button-addon2" active onClick={() => {loginUserFunct(username,password)}} >
                    Login
                </Button></Link>
                <Link to="/register">
                <Button className="button" variant="outline-secondary" id="button-addon2" active >
                    Create an account
                </Button></Link>

            </div>  
        </div>
    )
}

export default Login
