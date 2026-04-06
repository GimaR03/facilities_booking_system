function ATicketReplyPanel() {
  return (
    <article className="admin-card">
      <h3>Ticket Reply</h3>
      <p>Review issue tickets from users and send status updates quickly.</p>
      <ul>
        <li>Pending: 7</li>
        <li>In Progress: 3</li>
        <li>Closed: 12</li>
      </ul>
      <button type="button" className="card-btn">
        Open Ticket Replies
      </button>
    </article>
  );
}

export default ATicketReplyPanel;
