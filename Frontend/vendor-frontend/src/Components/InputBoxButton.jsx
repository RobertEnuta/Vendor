import React from 'react';
import { InputGroup,FormControl } from 'react-bootstrap';
import Button from 'react-bootstrap/Button';


function InputBoxButton(props) {
    return (
        <div>
        <InputGroup className="mb-3">
        <FormControl
            placeholder={props.value}
            aria-label= {props.value}
            aria-describedby="basic-addon2"
        />
        <Button variant="outline-secondary" id="button-addon2">
            {props.value2}
        </Button>
        </InputGroup>
        </div>
    )
}

export default InputBoxButton
