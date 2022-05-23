import React, { useState } from 'react';
import { Container, Row, Col } from 'react-bootstrap';
import Photo from '../Components/Photo';
import LazyImg from '../Components/LazyImg';
import bayo from '../images/test1.jpg';
import ListItems from '../Components/itemList';
import "../Styles/home.css"
function Home() {
  
  return (
    <div className="container">
      <Container className='bg'> 
        <ListItems className="bg" />
      </Container>
    </div>
    
  );

}


export default Home;
