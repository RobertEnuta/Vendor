import React from 'react';
import { LazyLoadImage } from 'react-lazy-load-image-component';

const LazyImg = ({ image }) => (
    <div>
      <LazyLoadImage
        src={image} // use normal <img> attributes as props
        width = "400px"
        height = "300px"
         />
      <span>{'text'}</span>
    </div>
  );
   
export default LazyImg;