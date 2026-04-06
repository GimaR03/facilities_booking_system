import './home.css';

function LoginIcon() {
	return (
		<svg viewBox="0 0 24 24" aria-hidden="true" focusable="false" className="home-login-icon">
			<circle cx="12" cy="8" r="4" />
			<path d="M4 21c0-4.2 3.8-7 8-7s8 2.8 8 7" />
		</svg>
	);
}

function Home({ onAdminClick, onTicketClick }) {
	return (
		<main className="home-page">
			<section className="home-card">
				<div className="home-top-row">
					<span className="home-login-text">Login</span>
					<LoginIcon />
				</div>

				<h1>Facilities Booking System</h1>
				<p>Manage halls and respond to ticket requests from one streamlined dashboard.</p>

				<div className="home-actions">
					<button type="button" className="primary-btn" onClick={onAdminClick}>
						Admin
					</button>
					<button type="button" className="secondary-btn" onClick={onTicketClick}>
						Ticket
					</button>
				</div>
			</section>
		</main>
	);
}

export default Home;
