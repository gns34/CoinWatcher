https://coinwatcher3.netlify.app/


# 💰 CoinWatcher

**CoinWatcher** is a full-stack cryptocurrency tracking web application built with **Java & Spring Boot** on the backend and **React** on the frontend. Instantly fetch, display, and compare live crypto prices and historical trends in a clean, responsive UI.

---

## 🚀 Features

- 📈 **Real-Time Prices** — Fetch live market data for top cryptocurrencies.
- 🔎 **Search & Filter** — Find specific coins by name or symbol.
- 📊 **Side-by-Side Comparison** — Compare price, market cap, 24h volume, and 24h change across multiple coins.
- 📆 **Historical Charts** — View price charts over 24h, 7d, 30d, and 1y intervals.
- ⭐ **Watchlist** — Save your favorite coins for quick access.
- 🌗 **Dark/Light Mode** — Theme toggle for comfortable browsing.

---

## 🛠️ Tech Stack

| Layer        | Technology                |
|--------------|---------------------------|
| Frontend     | React (Vite)              |
| Styling      | Tailwind CSS              |
| Backend      | Java 17, Spring Boot 3    |
| Data Source  | CoinGecko API             |

---

## 📂 Project Structure



coinwatcher/
│
├── backend/                  # Spring Boot API
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/yourorg/coinwatcher/
│   │   │   │   ├── controller/
│   │   │   │   ├── service/
│   │   │   │   └── model/
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   └── test/
│   └── pom.xml
│
├── frontend/                 # React client
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   ├── hooks/
│   │   └── App.jsx
│   ├── public/
│   └── package.json
│
└── README.md



---

## 🧪 Installation

1. **Clone the repo**  

   git clone https://github.com/yourusername/coinwatcher.git
   cd coinwatcher


2. **Backend Setup**

   cd backend
   ./mvnw clean install
   ./mvnw spring-boot:run


   * Edit `src/main/resources/application.properties` to include your API base URL if needed:


     coingecko.api.base-url=https://api.coingecko.com/api/v3

3. **Frontend Setup**


   cd ../frontend
   npm install
   npm run dev


   * The React app will launch at `http://localhost:5173`.

---

## 🔐 Environment Variables

| Key                      | Description                                  |
| ------------------------ | -------------------------------------------- |
| `COINGECKO_API_BASE_URL` | (optional) Base URL for CoinGecko endpoints. |

You can also set these in a `.env` file at the root of `frontend/` if you proxy API requests.

---

## 🌟 Future Enhancements

* 🛡️ **User Authentication** & secure watchlists
* 🔔 **Price Alerts** via email/push notifications
* 📉 **Candlestick Charts** for advanced analysis
* 📥 **Portfolio Tracking** with holdings & P/L
* 🌐 **Multi-language Support**

---

## 📄 License

Distributed under the **MIT License**. See [LICENSE](LICENSE) for details.

---

## 🙌 Acknowledgments

* [CoinGecko API](https://www.coingecko.com/en/api)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [React](https://reactjs.org/)
* [Tailwind CSS](https://tailwindcss.com/)

---
