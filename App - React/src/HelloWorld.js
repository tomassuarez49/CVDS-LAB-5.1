import React, { useState, useEffect } from 'react';

const HelloWorld = () => {
    const [message, setMessage] = useState('');

    useEffect(() => {
        fetchData();
    }, []);

    const fetchData = async () => {
        try {
            const response = await fetch('http://localhost:8080/clients');
            const data = await response.json();
            setMessage(data.message);
        } catch (error) {
            console.error('Error fetching data:', error);
        }
    };

    return (
        <div>
            <h1>Hello World</h1>
            <p>Message from Spring Boot service: {message}</p>
        </div>
    );
}

export default HelloWorld;
