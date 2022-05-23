import React from 'react';
import { Container } from 'react-bootstrap';
import ListItems from '../Components/itemList';
import '../Styles/itemList.css';

function ItemListing() {
  //changing tab title
  document.title ="Products";

  return (
    <div>
      <br></br>
      <Container className='title'>
        <ListItems />
      </Container>
    </div>
  );

}


export default ItemListing;
