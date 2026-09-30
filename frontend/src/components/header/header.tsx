function Header() {

  return (
    <div className="header">
      <div className="header__logo">
        <h1>Filmarium</h1>
      </div>
      <nav className="header__nav">
        <ul className="header__list">
          <li className="header__item">Repertuar</li>
          <li className="header__item">Newsy</li>
          <li className="header__item">Zapowiedzi</li>
          <li className="header__item">Oferty</li>
          <li className="header__item">Promocje</li>
        </ul>
      </nav>
    </div>
  );
}
export default Header;