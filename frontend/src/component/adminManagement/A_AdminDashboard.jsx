import './A_AdminDashboard.css';
import ATicketReplyPanel from './A_TicketReplyPanel';
import AHallsBookingPanel from './A_HallsBookingPanel';

function AAdminDashboard({ onBack }) {
	return (
		<main className="admin-page">
			<section className="admin-shell">
				<header className="admin-header">
					<div>
						<p className="admin-kicker">Admin Dashboard</p>
						<h2>Control Center</h2>
					</div>
					<button type="button" className="back-btn" onClick={onBack}>
						Back to Home
					</button>
				</header>

				<div className="admin-grid">
					<ATicketReplyPanel />
					<AHallsBookingPanel />
				</div>
			</section>
		</main>
	);
}

export default AAdminDashboard;
