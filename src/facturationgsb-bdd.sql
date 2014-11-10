-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 04 Novembre 2014 à 14:52
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `facturationgsb`
--

-- --------------------------------------------------------

--
-- Structure de la table `article`
--

CREATE TABLE IF NOT EXISTS `article` (
  `codeArticle` varchar(11) COLLATE utf8_bin NOT NULL,
  `designation` varchar(20) COLLATE utf8_bin NOT NULL,
  `quantite` int(11) NOT NULL,
  `prixUnitaire` double NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

CREATE TABLE IF NOT EXISTS `categorie` (
  `codeCategorie` varchar(11) COLLATE utf8_bin NOT NULL,
  `designation` varchar(20) COLLATE utf8_bin NOT NULL,
  UNIQUE KEY `code` (`codeCategorie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `facture`
--

CREATE TABLE IF NOT EXISTS `facture` (
  `codeFacture` varchar(20) COLLATE utf8_bin NOT NULL,
  `codeClient` varchar(20) COLLATE utf8_bin NOT NULL,
  `totalTtc` double NOT NULL,
  `codeModereglement` int(11) NOT NULL,
  `modeReglement` varchar(20) COLLATE utf8_bin NOT NULL,
  `date` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `lignefactures`
--

CREATE TABLE IF NOT EXISTS `lignefactures` (
  `codeFacture` varchar(20) COLLATE utf8_bin NOT NULL,
  `Article` varchar(20) COLLATE utf8_bin NOT NULL,
  `quantite` int(20) NOT NULL,
  `prixUnitaire` double NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `modereglement`
--

CREATE TABLE IF NOT EXISTS `modereglement` (
  `codeModeReglement` int(11) NOT NULL,
  `type` varchar(20) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

CREATE TABLE IF NOT EXISTS `personne` (
  `code` varchar(11) COLLATE utf8_bin NOT NULL,
  `nom` varchar(15) COLLATE utf8_bin NOT NULL,
  `prenom` varchar(15) COLLATE utf8_bin NOT NULL,
  UNIQUE KEY `code` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
