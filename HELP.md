# Getting Started

### Database
1. Install Docker Desktop on your computer (https://docs.docker.com/desktop/) and open it
2. Navigate to /database
3. Run docker compose up --build --renew-anon-volumes -d
4. Docker setup comes with Adminer UI, where you can check the database contents at http://localhost:8088/

Database is running at postgres://localhost:5432/database and the database name is database. Database comes with user: user (password: password).