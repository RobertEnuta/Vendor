import React, { Component } from 'react'
import itemService from '../services/itemService';

export default class DisplayItem extends Component {
    constructor(props){
        super(props);

        this.state = {
            items: []
        }
    }

    componentDidMount(){
        var id = 1
        itemService.getItems(id).then((res) => {
            this.setState({ items: res.data});
        });
    }
    
    render() {
        return (
            <div>
                <h2 className="text-center">Item</h2>
                        <body>
                            {
                                this.state.items.map
                                (
                                    item =>
                                    <tr key = {item.id}>
                                        <td> {item.id} </td>
                                        <td> {item.name} </td>
                                        <td> {item.price} </td>
                                        <td> {item.userid} </td>
                                        <td> {item.description} </td>
                                        <td> {item.uploadDate} </td>
                                    </tr>
                                )
                            }
                        </body>
            </div>
        )
    }
}
