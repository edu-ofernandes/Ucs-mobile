import React from 'react';
import './css/Header.css';

class Header extends React.Component{
    render(){
        return (
            <header>
                <div className="item">
                    <h2>Home</h2>
                </div>
                <div className="item">
                    <h2>About</h2>
                </div>
                
            </header>
        );
    }
}

export default Header;
