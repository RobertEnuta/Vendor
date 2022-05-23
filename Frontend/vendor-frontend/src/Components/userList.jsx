import React, { Component } from 'react'
import userService from '../services/userService';

export default class ListUsers extends Component {
    constructor(props){
        super(props);

        this.state = {
            users: []
        }
    }

    componentDidMount(){
        userService.getUsers().then((res) => {
            this.setState({ users: res.data});
        });
    }
    
    render() {
        return (
            <div>
                <h2 className="text-center">Users</h2>
                <div className="row">
                    <table className="table table-striped table-bordered">
                        <thead>
                            <tr>
                                <th> ID </th>
                                <th> Username </th>
                                <th> Email </th>
                            </tr>
                        </thead>
                        <body>
                            {
                                this.state.users.map
                                (
                                    user =>
                                    <tr key = {user.id}>
                                        <td> {user.id} </td>
                                        <td> {user.username} </td>
                                        <td> {user.email} </td>
                                    </tr>
                                )
                            }
                        </body>
                    </table>
                </div>
            </div>
        )
    }
}
