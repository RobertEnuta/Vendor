import React from 'react';
import { InputGroup,FormControl } from 'react-bootstrap';

function InputTextBox(props) {
    return (
        <div>
        <InputGroup className="mb-3">
        <FormControl
            placeholder={props.value}
            aria-label= {props.value}
            aria-describedby="basic-addon2"
        />
        </InputGroup>
        </div>
    )
}

export default InputTextBox
