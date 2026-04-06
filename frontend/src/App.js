import './App.css';
import { useState } from 'react';
import Home from './component/home/home';
import AAdminDashboard from './component/adminManagement/A_AdminDashboard';

function App() {
  const [currentPage, setCurrentPage] = useState('home');

  const handleAdminClick = () => {
    setCurrentPage('admin');
  };

  const handleTicketClick = () => {
    setCurrentPage('admin');
  };

  const handleBackToHome = () => {
    setCurrentPage('home');
  };

  return (
    <div className="App">
      {currentPage === 'home' ? (
        <Home onAdminClick={handleAdminClick} onTicketClick={handleTicketClick} />
      ) : (
        <AAdminDashboard onBack={handleBackToHome} />
      )}
    </div>
  );
}

export default App;
