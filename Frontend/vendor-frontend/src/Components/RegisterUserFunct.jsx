import React, { Component } from 'react'
import registerService from "../services/registerService"

export default function reg(username,password,email,password2){
    //when siging up everyone will be a user and more admin accounts can be created later
    var role="user";
    if (password != password2){
        alert("Passwords do not match!");
        return;
    }
    // alert("Registration successful!");
    return registerService.Auth(username,password,email,role);
}
    
