import React,{ Component } from 'react';
import "../Styles/log.css";
import Button from 'react-bootstrap/Button';
import InputTextBox from '../Components/InputTextBox';
import { Link } from "react-router-dom";
import {useState} from "react";
import reg from '../Components/RegisterUserFunct';

function Register() {
    document.title ="Register";

    var [username, setUsername] = useState("");
    const handleUsernameChange = (e) => {
        e.preventDefault();
        setUsername(e.target.value);
    };

    var [password, setPassword] = useState("");
    const handlePasswordChange = (e) => {
        e.preventDefault();
        setPassword(e.target.value);
    };

    var [email, setEmail] = useState("");
    const handleEmailChange = (e) => {
        e.preventDefault();
        setEmail(e.target.value);
    };
    
    var [password2, setPassword2] = useState("");
    const handlePassword2Change = (e) => {
        e.preventDefault();
        setPassword2(e.target.value);
    };
    return (
        <div>
            <div className="form">
                <div className="title"> Create an account </div>
                User Name
                <br />
                <input
                    className="login-input"
                    onChange={handleUsernameChange}
                    placeholder="Username"
                    value={username}
                    type="username"
                    required
                />
                <br />
                {/* <InputTextBox value={"User Name"} key={"username"}/> */}
                {/* <InputTextBox value={"Email"} key={"email"}/> */}
                Email
                <br />
                <input
                    className="login-input"
                    onChange={handleEmailChange}
                    placeholder="Email"
                    value={email}
                    type="email"
                    required
                />
                <br />
                Password
                <br />
                <input
                    className="login-input"
                    onChange={handlePasswordChange}
                    placeholder="password"
                    value={password}
                    type="password"
                    required
                />
                <br />
                {/* <InputTextBox value={"Password"} key={"password"}/> */}
                Repeat Password
                <br />
                <input
                    className="login-input"
                    onChange={handlePassword2Change}
                    placeholder="Repeat password"
                    value={password2}
                    type="password"
                    required
                />
                <br />
                {/* <InputTextBox value={"Repeat password"} key={"repeatedPass"}/>  */}
                <Button className="button" variant="primary" id="button-addon2" onClick={() => {reg(username,password,email,password2)}}>
                    Register
                </Button><Link to="/login">
                <Button className="button" variant="secondary" id="button-addon2" >
                    I already have an account!
                </Button></Link>

            </div>              
        </div>
    )
}

export default Register
