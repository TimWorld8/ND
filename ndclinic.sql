-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3336
-- Generation Time: Apr 20, 2023 at 08:05 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ndclinic`
--

-- --------------------------------------------------------

--
-- Table structure for table `district`
--

CREATE TABLE `district` (
  `d_code` varchar(4) NOT NULL,
  `d_name_th` varchar(30) NOT NULL,
  `d_name_en` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `district`
--

INSERT INTO `district` (`d_code`, `d_name_th`, `d_name_en`) VALUES
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1'),
('1', '1', '1');

-- --------------------------------------------------------

--
-- Table structure for table `hist_heal`
--

CREATE TABLE `hist_heal` (
  `HN` varchar(7) NOT NULL,
  `check_date_time` datetime NOT NULL,
  `SYS` int(11) NOT NULL,
  `DIA` int(11) NOT NULL,
  `pulse` int(11) NOT NULL,
  `tempC` float NOT NULL,
  `height` int(11) NOT NULL,
  `weight` float NOT NULL,
  `symptom` varchar(50) NOT NULL,
  `comment` varchar(100) NOT NULL,
  `t_disease_name` varchar(50) NOT NULL,
  `med_disease_name` varchar(50) NOT NULL,
  `next_date_time` datetime NOT NULL,
  `staff_id` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `HN` varchar(30) NOT NULL,
  `id_num` varchar(13) NOT NULL,
  `p_pre_name` varchar(7) NOT NULL,
  `p_fname` varchar(30) NOT NULL,
  `p_lname` varchar(30) NOT NULL,
  `birth_date` date NOT NULL,
  `job` varchar(20) NOT NULL,
  `address` varchar(20) NOT NULL,
  `code` varchar(5) NOT NULL,
  `p_tel` varchar(10) NOT NULL,
  `p_nation` varchar(20) NOT NULL,
  `p_religion` varchar(10) NOT NULL,
  `p_gender` int(11) NOT NULL,
  `p_status` int(11) NOT NULL,
  `r_fname` varchar(30) NOT NULL,
  `r_lname` varchar(30) NOT NULL,
  `r_tel` varchar(10) NOT NULL,
  `r_status` varchar(10) NOT NULL,
  `t_birth_date` date NOT NULL,
  `t_day` int(11) NOT NULL,
  `t_month` int(11) NOT NULL,
  `t_year` int(11) NOT NULL,
  `main_element` int(11) NOT NULL,
  `sub_element` int(11) NOT NULL,
  `weak_element` varchar(30) NOT NULL,
  `med_allergic` varchar(30) NOT NULL,
  `food_allergic` varchar(30) NOT NULL,
  `hist_ill` varchar(100) NOT NULL,
  `hist_illF` varchar(100) NOT NULL,
  `hist_live` varchar(100) NOT NULL,
  `hist_period` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`HN`, `id_num`, `p_pre_name`, `p_fname`, `p_lname`, `birth_date`, `job`, `address`, `code`, `p_tel`, `p_nation`, `p_religion`, `p_gender`, `p_status`, `r_fname`, `r_lname`, `r_tel`, `r_status`, `t_birth_date`, `t_day`, `t_month`, `t_year`, `main_element`, `sub_element`, `weak_element`, `med_allergic`, `food_allergic`, `hist_ill`, `hist_illF`, `hist_live`, `hist_period`) VALUES
('0', '0', '0', '0', '0', '0000-00-00', '', '', '', '', '', '', 0, 0, '', '', '', '', '0000-00-00', 0, 0, 0, 0, 0, '', '', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `pay_drug`
--

CREATE TABLE `pay_drug` (
  `d_name` varchar(30) NOT NULL,
  `d_amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `proviences`
--

CREATE TABLE `proviences` (
  `pro_code` varchar(2) NOT NULL,
  `name_th` varchar(30) NOT NULL,
  `name_en` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `staff_id` varchar(10) NOT NULL,
  `s_pre_name` varchar(7) NOT NULL,
  `s_fname` varchar(30) NOT NULL,
  `s_lname` varchar(30) NOT NULL,
  `s_tel` varchar(10) NOT NULL,
  `s_gender` int(11) NOT NULL,
  `s_role` varchar(30) NOT NULL,
  `staff_pw` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`staff_id`, `s_pre_name`, `s_fname`, `s_lname`, `s_tel`, `s_gender`, `s_role`, `staff_pw`) VALUES
('640434', 'Miss', 'Thawanphatchanon', 'Mainkool', '0968141337', 2, 'Student', 'j1032546');

-- --------------------------------------------------------

--
-- Table structure for table `sub_diftrict`
--

CREATE TABLE `sub_diftrict` (
  `sd_code` varchar(6) NOT NULL,
  `zip_code` varchar(5) NOT NULL,
  `sd_name_th` varchar(30) NOT NULL,
  `sd_name_en` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`HN`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
