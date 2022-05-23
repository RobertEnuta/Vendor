import React from 'react'
import image from '../images/test1.jpg'
import Image from 'react-bootstrap/Image';

function Photo(name) {
    var path = '../images/' + name;
    return (
        <div>
            <Image src={image} fluid thumbnail />
        </div>
    )
}

export default Photo
