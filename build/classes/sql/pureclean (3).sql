-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2025 at 06:17 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pureclean`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_logs`
--

CREATE TABLE `tbl_logs` (
  `log_id` int(11) NOT NULL,
  `user_name` varchar(100) NOT NULL,
  `action` text NOT NULL,
  `log_time` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_logs`
--

INSERT INTO `tbl_logs` (`log_id`, `user_name`, `action`, `log_time`) VALUES
(1, 'lucky@gmail.com', 'Failed login attempt', '2025-05-14 03:44:08'),
(2, 'lucky@gmail.com', 'Employee logged in', '2025-05-14 03:44:13'),
(3, 'test@gmail.com', 'Failed login attempt', '2025-05-14 03:48:39'),
(4, 'lucky@gmail.com', 'Failed login attempt', '2025-05-14 03:48:56'),
(5, 'lucky@gmail.com', 'Admin logged in', '2025-05-14 03:49:10'),
(6, 'lucky@gmail.com', 'Admin logged in', '2025-05-14 03:53:01'),
(7, 'lucky@gmail.com', 'Admin logged in', '2025-05-14 03:54:14'),
(8, 'lucky@gmail.com', 'Employee logged in', '2025-05-14 03:54:55'),
(9, 'lucky@gmail.com', 'Employee logged in', '2025-05-14 03:58:14');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_reservation`
--

CREATE TABLE `tbl_reservation` (
  `r_id` int(11) NOT NULL,
  `r_customername` varchar(100) NOT NULL,
  `r_type` varchar(100) NOT NULL,
  `r_creationdate` datetime NOT NULL DEFAULT current_timestamp(),
  `r_servicestartdate` varchar(100) NOT NULL,
  `r_status` varchar(100) NOT NULL,
  `r_cost` decimal(10,2) NOT NULL,
  `r_cnumber` varchar(100) NOT NULL,
  `r_location` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_reservation`
--

INSERT INTO `tbl_reservation` (`r_id`, `r_customername`, `r_type`, `r_creationdate`, `r_servicestartdate`, `r_status`, `r_cost`, `r_cnumber`, `r_location`) VALUES
(1, 'Valentino', 'Basic Cleaning', '2025-05-14 11:47:54', '05/15/2025 02:30 PM', 'Pending', 50.00, '09123456789', 'Lipata');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(20) NOT NULL,
  `u_firstname` varchar(50) NOT NULL,
  `u_lastname` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_contactnumber` varchar(50) NOT NULL,
  `u_password` varchar(50) DEFAULT NULL,
  `u_hashpw` varchar(100) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL,
  `u_question` varchar(100) NOT NULL,
  `u_answer` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_firstname`, `u_lastname`, `u_email`, `u_contactnumber`, `u_password`, `u_hashpw`, `u_type`, `u_status`, `u_question`, `u_answer`) VALUES
(1, 'Vienz', 'Libradilla', 'test@gmail.com', '09123456789', 'test1', '', 'Admin', 'Active', '', ''),
(2, 'john', 'doe', 'doe@gmail.com', '09123456789', 'test', '', 'Employee', 'Active', '', ''),
(3, 'tino', 'luck', 'noob@gmail.com', '09123456789', '12345678', '', 'Employee', 'Active', '', ''),
(17, 'v', 'v', 'test123@gmail.com', '09123456789', 'tino12345', '', 'Employee', 'Active', '', ''),
(19, 'vienz', 'lol', 'test11@gmail.com', '09123456789', 'test12345', '6fec2a9601d5b3581c94f2150fc07fa3d6e45808079428354b868e412b76e6bb', 'Employee', 'Active', '', ''),
(20, 'anada', '11', 'lol@gmail.com', '09123456789', 'lol12345', '4c9ce80535031ff779634cf010af8abbf50be0f4f74614a6f6e6503a47140bc1', 'Employee', 'Active', '', ''),
(21, 'admin', 'admin', 'admin@gmail.com', '09123456789', 'admin12345', '41e5653fc7aeb894026d6bb7b2db7f65902b454945fa8fd65a6327047b5277fb', 'Admin', 'Active', '', ''),
(22, 'tino', 'tino', 'tino@gmai.com', '09123456789', NULL, 'c6ac1a630740af8ef3571c20159cf2a6763915ec13093b91bcad00367180bf24', 'Employee', 'Active', '', ''),
(23, 'tin', 'juvy', 'juvy@gmail.com', '09123456789', NULL, '81d6b81e9f3622cebc0d5ce909947c6af85410828bb9edd3c247bd06de389da5', 'Admin', 'Active', '', ''),
(24, 'tin', 'juvy', 'juvy1@gmail.com', '09123456789', NULL, '81d6b81e9f3622cebc0d5ce909947c6af85410828bb9edd3c247bd06de389da5', 'Admin', 'Active', '', ''),
(26, 'tt', 'tt', 'tt@gmail.com', '09123456789', NULL, '72b5f15be8faa8fe87c76d2535af92e8821cfb59c3d9ed43ab0af4319fb566e8', 'Admin', 'Active', '', ''),
(27, 'test', 'test', 'test1@gmail.com', '09123456789', NULL, '4c9ce80535031ff779634cf010af8abbf50be0f4f74614a6f6e6503a47140bc1', 'Admin', 'Active', 'lol', 'oten'),
(28, 'lol', 'lol', 'lol1@gmail.com', '09123456789', NULL, 'c63c294a92e253e7f7a3e5417a95e6ae598b68d82d5136d18c8fa9d992474799', 'Employee', 'Active', '', ''),
(29, 'pok', 'pokk', 'pokk@gmail.com', '09123456789', NULL, 'pok12345', 'Admin', 'Active', 'lol', 'oten'),
(30, 'Vienz', 'Cliff', 'lucky@gmail.com', '09123456789', NULL, 'e8779e0367b50fdf6f2b1d77fef879df92dcaafc3e5ef0a3b6e3867eccd2fd74', 'Employee', 'Active', 'What is your mother\'s maiden name?', 'celese');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD PRIMARY KEY (`log_id`);

--
-- Indexes for table `tbl_reservation`
--
ALTER TABLE `tbl_reservation`
  ADD PRIMARY KEY (`r_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `tbl_reservation`
--
ALTER TABLE `tbl_reservation`
  MODIFY `r_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
