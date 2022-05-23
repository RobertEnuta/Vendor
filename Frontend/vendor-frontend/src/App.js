import React from 'react';
import './App.css';
import NavBar from './Components/navbar';
import { BrowserRouter as Router,Switch,Route } from 'react-router-dom';
import Home from './pages/Home';
import Profile from './pages/Profile';
import ItemListing from './pages/ItemList';
import Register from './pages/Register';
import Login from './pages/Login';
import Footer from './Components/Footer';
import ProductPage from './pages/Product';


function App() {
  return (
    <body>
      <Router>
        <NavBar/>
        <Switch>
          <Route path='/' exact component={Home} /> 
          <Route path='/profile' exact component={Profile} />
          <Route path='/items' exact component={ItemListing} />
          <Route path='/register' exact component={Register} />
          <Route path='/login' exact component={Login} /> 
          <Route path='/product' exact component={ProductPage} /> 
        </Switch>
      </Router>
      <Footer/>
    </body>
  );

}



export default App;
