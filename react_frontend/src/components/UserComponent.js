import React from "react";
import UserServices from "../services/UserServices";
import "./UserComponent.css";

class UserComponent extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      users: [],
    };
  }

  componentDidMount() {
    UserServices.getUsers().then((Response) => {
      this.setState({ users: Response.data });
    });
  }

  render() {
    return (
      <div class="container">
        <h1 className="text-center ">Users List</h1>
        <table>
          <thead>
            <tr class="head">
              <td>User Id</td>
              <td>User First Name</td>
              <td>User Last Name</td>
              <td>User Email Id</td>
            </tr>
          </thead>
          <tbody>
            {this.state.users.map((user) => (
              <tr key={user.id}>
                <td>{user.id}</td>
                <td>{user.firstName}</td>
                <td>{user.lastName}</td>
                <td>{user.email}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default UserComponent;
