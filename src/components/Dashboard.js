import React, { useEffect, useState } from 'react';
import axios from "axios";
import './Dashboard.css';

function Dashboard() {
  const [address, setaddress] = useState([]);

  // Fetch items when the component mounts
  useEffect(() => {
    fetchItems();
  }, []);

  // Function to fetch items from the backend API
  const fetchItems = () => {
    axios
      .get("http://localhost:8080/api/show") // Replace with your API endpoint
      .then((res) => {
        setaddress(res.data); // Assuming the API returns an array of books
      })
      .catch((error) => {
        console.error("Error fetching data:", error);
      });
  };

 return (
    <div className="dashboard-container">
      <div className="dashboard-wrapper">
        <div className="dashboard-card">
          <div className="dashboard-header">
            <h1>Address Details</h1>
          </div>
          
        { address.length > 0 ? (
            <div className="table-container">
              <table className="data-table">
                <thead>
                  <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Phone Number</th>
                    <th>Email</th>
                    <th>Address</th>
                  </tr>
                </thead>
                <tbody>
                  {address.map((addressItem) => (
                    <tr key={addressItem.id}>
                      <td>{addressItem.id}</td>
                      <td>{addressItem.name}</td>
                      <td>{addressItem.phNo}</td>
                      <td>{addressItem.email}</td>
                      <td>{addressItem.address}</td>
                    </tr>
                  ))}
                </tbody>
              </table>
            </div>
          ) : (
            <div className="no-data-message">
              <p>No address details available</p>
            </div>
          )}
        </div>
      </div>
    </div>
  );
}
export default Dashboard;