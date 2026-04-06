function AHallsBookingPanel() {
  return (
    <article className="admin-card">
      <h3>Halls Booking</h3>
      <p>Track hall reservations, approve requests, and manage availability windows.</p>
      <ul>
        <li>New Requests: 5</li>
        <li>Approved Today: 9</li>
        <li>Need Review: 2</li>
      </ul>
      <button type="button" className="card-btn">
        Open Hall Booking
      </button>
    </article>
  );
}

export default AHallsBookingPanel;
