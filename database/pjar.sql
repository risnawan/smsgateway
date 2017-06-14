-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 14, 2017 at 03:28 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pjar`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(2) NOT NULL,
  `namaadmin` varchar(10) NOT NULL,
  `passadmin` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `namaadmin`, `passadmin`) VALUES
(1, 'Anida', 'anida'),
(2, 'Bhakti', 'bhakti'),
(3, 'Heraldy', 'heraldy'),
(4, 'Linda', 'linda'),
(5, 'Risnawan', 'risnawan');

-- --------------------------------------------------------

--
-- Table structure for table `gempa`
--

CREATE TABLE `gempa` (
  `id_gempa` int(2) NOT NULL,
  `kekuatan_gempa` int(2) NOT NULL,
  `kedalaman_gempa` int(5) NOT NULL,
  `lempeng_terangkat` tinyint(1) NOT NULL,
  `lokasi_gempa` varchar(20) NOT NULL,
  `jarak_gempa` int(5) NOT NULL,
  `potensi_tsunami` tinyint(1) NOT NULL,
  `pesan_peringatan` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gempa`
--

INSERT INTO `gempa` (`id_gempa`, `kekuatan_gempa`, `kedalaman_gempa`, `lempeng_terangkat`, `lokasi_gempa`, `jarak_gempa`, `potensi_tsunami`, `pesan_peringatan`) VALUES
(1, 6, 20, 1, 'Gatau', 5, 0, 'Sudah'),
(2, 6, 20, 1, 'Gatau', 5, 0, 'sudah'),
(3, 3, 100, 1, 'maluky', 30, 0, 'Belum');

-- --------------------------------------------------------

--
-- Table structure for table `pesan`
--

CREATE TABLE `pesan` (
  `id_pesan` int(3) NOT NULL,
  `no_tujuan` varchar(13) NOT NULL,
  `isi_pesan` text NOT NULL,
  `waktu` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pesan`
--

INSERT INTO `pesan` (`id_pesan`, `no_tujuan`, `isi_pesan`, `waktu`, `status`) VALUES
(1, '083890934438', 'Halo, ini isi pesan Tes 1', '2017-06-06 17:53:03', ''),
(2, '083890934438', 'Halo, ini isi pesan Tes 2', '2017-06-06 17:53:03', ''),
(3, '', '', '2017-06-06 17:53:03', ''),
(4, 'sd', 'sdsds', '2017-06-06 17:53:03', ''),
(5, '081382690461', 'hahah hai', '2017-06-06 17:53:03', ''),
(6, '081382690461', '081382690461081382690461', '2017-06-06 17:53:03', ''),
(7, '081382690461', 'asasd', '2017-06-06 17:53:03', ''),
(8, '21212112', '', '2017-06-06 17:53:03', ''),
(9, '2121', '', '2017-06-06 17:53:03', ''),
(10, '121', '', '2017-06-06 17:53:03', ''),
(11, '3', '', '2017-06-06 17:53:03', ''),
(12, '081382690461', 'hahaha', '2017-06-06 17:53:03', ''),
(13, '081382690461', 'hahaha', '2017-06-06 17:53:03', ''),
(14, '081382690461', 'hahaha', '2017-06-06 17:53:03', ''),
(15, '081382690461', 'hahaha', '2017-06-06 17:53:03', ''),
(16, '081382690461', '', '2017-06-06 18:04:02', 'terkirim'),
(17, '1231231', '123123', '2017-06-06 18:04:47', 'terkirim'),
(18, '11111', '1111', '2017-06-06 18:05:52', 'tidak terkirim'),
(19, '081908316892', 'pesan 0', '2017-06-12 02:21:11', 'terkirim'),
(20, '081908316892', 'pesan 1', '2017-06-12 02:21:22', 'terkirim'),
(21, '081908316892', 'pesan 2', '2017-06-12 02:21:33', 'terkirim'),
(22, '081908316892', 'pesan 3', '2017-06-12 02:21:44', 'terkirim'),
(23, '081908316892', 'pesan 4', '2017-06-12 02:21:55', 'terkirim'),
(24, '081908316892', 'pesan 5', '2017-06-12 02:22:06', 'terkirim'),
(25, '081908316892', 'pesan 6', '2017-06-12 02:22:17', 'terkirim'),
(26, '081908316892', 'pesan 7', '2017-06-12 02:22:28', 'terkirim'),
(27, '081908316892', 'pesan 8', '2017-06-12 02:22:39', 'terkirim'),
(28, '081908316892', 'pesan 9', '2017-06-12 02:22:50', 'terkirim'),
(29, '081908316892', 'pesan 10', '2017-06-12 02:23:01', 'terkirim'),
(30, '081908316892', 'pesan 11', '2017-06-12 02:23:11', 'terkirim'),
(31, '081908316892', 'pesan 12', '2017-06-12 02:23:22', 'terkirim'),
(32, '081908316892', 'pesan ', '2017-06-12 02:35:49', 'tidak terkirim'),
(33, '081908316892', 'pesan ', '2017-06-12 02:41:33', 'tidak terkirim'),
(34, '081908316892', 'pesan ', '2017-06-12 02:44:15', 'tidak terkirim'),
(35, '081908316892', 'pesan ', '2017-06-12 03:11:06', 'tidak terkirim'),
(36, '081908316892', 'pesan ', '2017-06-12 03:19:37', 'terkirim'),
(37, '085959221700', 'hai debby', '2016-06-13 08:12:17', 'terkirim'),
(38, '085959221700', 'hai debby', '2016-06-13 08:12:19', 'terkirim'),
(39, '085959221700', 'hai debby', '2016-06-13 08:12:21', 'terkirim'),
(40, '085959221700', 'hai debby', '2016-06-13 08:12:23', 'terkirim'),
(41, '085959221700', 'hai debby', '2016-06-13 08:12:25', 'terkirim'),
(42, '085959221700', 'hai debby', '2016-06-13 08:12:27', 'terkirim'),
(43, '085959221700', 'hai debby', '2016-06-13 08:12:29', 'terkirim'),
(44, '085959221700', 'hai debby', '2016-06-13 08:12:31', 'terkirim'),
(45, '085959221700', 'hai debby', '2016-06-13 08:12:33', 'terkirim'),
(46, '085959221700', 'hai debby', '2016-06-13 08:12:35', 'terkirim'),
(47, '085959221700', 'hai debby', '2016-06-13 08:12:37', 'terkirim'),
(48, '085959221700', 'hai debby', '2016-06-13 08:12:39', 'terkirim'),
(49, '085959221700', 'hai debby', '2016-06-13 08:12:41', 'terkirim'),
(50, '085959221700', 'hai debby', '2016-06-13 08:12:43', 'terkirim'),
(51, '085959221700', 'hai debby', '2016-06-13 08:12:45', 'terkirim'),
(52, '085959221700', 'hai debby', '2016-06-13 08:12:47', 'terkirim'),
(53, '085959221700', 'hai debby', '2016-06-13 08:12:49', 'terkirim'),
(54, '085959221700', 'hai debby', '2016-06-13 08:12:51', 'terkirim'),
(55, '085959221700', 'hai debby', '2016-06-13 08:12:53', 'terkirim'),
(56, '085959221700', 'hai debby', '2016-06-13 08:12:55', 'terkirim'),
(57, '085959221700', 'hai debby', '2016-06-13 08:13:05', 'terkirim'),
(58, '085959221700', 'hai debby', '2016-06-13 08:13:07', 'terkirim'),
(59, '085959221700', 'hai debby', '2016-06-13 08:13:09', 'terkirim'),
(60, '085959221700', 'hai debby', '2016-06-13 08:13:11', 'terkirim'),
(61, '085959221700', 'hai debby', '2016-06-13 08:13:13', 'terkirim'),
(62, '085959221700', 'hai debby', '2016-06-13 08:13:15', 'terkirim'),
(63, '085959221700', 'hai debby', '2016-06-13 08:13:17', 'terkirim'),
(64, '085959221700', 'hai debby', '2016-06-13 08:13:19', 'terkirim'),
(65, '085959221700', 'hai debby', '2016-06-13 08:13:21', 'terkirim'),
(66, '085959221700', 'hai debby', '2016-06-13 08:13:23', 'terkirim'),
(67, '085959221700', 'hai debby', '2016-06-13 08:13:25', 'terkirim'),
(68, '085959221700', 'hai debby', '2016-06-13 08:13:27', 'terkirim'),
(69, '085959221700', 'hai debby,', '2017-06-13 09:04:52', 'terkirim'),
(70, '085959221700', '', '2017-06-13 09:07:47', 'terkirim'),
(71, '', '', '2017-06-13 09:08:58', 'tidak terkirim'),
(72, '083895622226', 'hai debby', '2017-06-13 09:11:46', 'terkirim'),
(73, '081291537743', 'hai debby', '2017-06-13 09:11:48', 'terkirim'),
(74, '087783874051', 'hai debby', '2017-06-13 09:12:03', 'tidak terkirim'),
(75, '085781331663', 'hai debby', '2017-06-13 09:12:04', 'tidak terkirim'),
(76, '083890934438', 'hai debby', '2017-06-13 09:12:04', 'tidak terkirim'),
(77, '083895622226\r', 'hai debby', '2017-06-13 09:12:04', 'tidak terkirim'),
(78, '083895622226\r', 'hai debby', '2017-06-13 09:12:04', 'tidak terkirim'),
(79, '083895622226\r', 'hai debby', '2017-06-13 09:12:04', 'tidak terkirim'),
(80, '083895622226', 'hai debby', '2017-06-13 09:12:04', 'tidak terkirim'),
(81, '083895622226', 'dari risnawan', '2017-06-13 09:13:44', 'terkirim'),
(82, '081291537743', 'dari risnawan', '2017-06-13 09:13:46', 'terkirim'),
(83, '083895622226', 'dari risnawan', '2017-06-13 09:15:01', 'terkirim'),
(84, '081291537743', 'dari risnawan', '2017-06-13 09:15:03', 'terkirim'),
(85, '087783874051', 'dari risnawan', '2017-06-13 09:15:05', 'terkirim'),
(86, '085781331663', 'dari risnawan', '2017-06-13 09:15:20', 'tidak terkirim'),
(87, '083890934438', 'dari risnawan', '2017-06-13 09:15:20', 'tidak terkirim'),
(88, '083895622226\r', 'dari risnawan', '2017-06-13 09:15:20', 'tidak terkirim'),
(89, '083895622226\r', 'dari risnawan', '2017-06-13 09:15:20', 'tidak terkirim'),
(90, '083895622226\r', 'dari risnawan', '2017-06-13 09:15:20', 'tidak terkirim'),
(91, '083895622226', 'dari risnawan', '2017-06-13 09:15:20', 'tidak terkirim'),
(92, '081382690461', 'hai wawaw', '2017-06-13 12:50:03', 'terkirim'),
(93, '081382690461', 'hai wawaw', '2017-06-13 12:50:05', 'terkirim'),
(94, '081382690461', 'hai wawaw', '2017-06-13 12:50:07', 'terkirim'),
(95, '081382690461', 'hai wawaw', '2017-06-13 12:50:09', 'terkirim'),
(96, '081382690461', 'hai wawaw', '2017-06-13 12:50:11', 'terkirim'),
(97, '081382690461', 'hai wawaw', '2017-06-13 12:50:13', 'terkirim'),
(98, '081382690461', 'hai wawaw', '2017-06-13 12:50:15', 'terkirim'),
(99, '081382690461', 'hai wawaw', '2017-06-13 12:50:17', 'terkirim'),
(100, '081382690461', 'hai wawaw', '2017-06-13 12:50:19', 'terkirim'),
(101, '081382690461', 'hai wawaw', '2017-06-13 12:50:21', 'terkirim'),
(102, '081382690461', 'hai wawaw', '2017-06-13 12:50:23', 'terkirim'),
(103, '081382690461', 'hai wawaw', '2017-06-13 12:50:25', 'terkirim'),
(104, '081382690461', 'hai wawaw', '2017-06-13 12:50:27', 'terkirim'),
(105, '081382690461', 'hai wawaw', '2017-06-13 12:50:29', 'terkirim'),
(106, '081382690461', 'hai wawaw', '2017-06-13 12:50:31', 'terkirim'),
(107, '081382690461', 'hai wawaw', '2017-06-13 12:50:33', 'terkirim'),
(108, '081382690461', 'hai wawaw', '2017-06-13 12:50:35', 'terkirim'),
(109, '081382690461', 'hai wawaw', '2017-06-13 12:50:37', 'terkirim'),
(110, '081382690461', 'cie cie', '2017-06-13 12:51:26', 'terkirim'),
(111, '081382690461', 'cie cie', '2017-06-13 12:51:28', 'terkirim'),
(112, '081382690461', 'cie cie', '2017-06-13 12:51:30', 'terkirim'),
(113, '081382690461', 'cie cie', '2017-06-13 12:51:32', 'terkirim'),
(114, '081382690461', 'cie cie', '2017-06-13 12:51:34', 'terkirim'),
(115, '081382690461', 'cie cie', '2017-06-13 12:51:36', 'terkirim'),
(116, '081382690461', 'cie cie', '2017-06-13 12:51:38', 'terkirim'),
(117, '081382690461', 'cie cie', '2017-06-13 12:51:40', 'terkirim'),
(118, '081382690461', 'cie cie', '2017-06-13 12:51:42', 'terkirim'),
(119, '081382690461', 'cie cie', '2017-06-13 12:51:44', 'terkirim'),
(120, '081382690461', 'cie cie', '2017-06-13 12:51:46', 'terkirim'),
(121, '081382690461', 'cie cie', '2017-06-13 12:51:48', 'terkirim'),
(122, '081382690461', 'cie cie', '2017-06-13 12:51:50', 'terkirim'),
(123, '081382690461', 'cie cie', '2017-06-13 12:51:52', 'terkirim'),
(124, '081382690461', 'cie cie', '2017-06-13 12:51:54', 'terkirim'),
(125, '081382690461', 'cie cie', '2017-06-13 12:51:56', 'terkirim'),
(126, '081382690461', 'cie cie', '2017-06-13 12:51:58', 'terkirim'),
(127, '081382690461', 'cie cie', '2017-06-13 12:52:00', 'terkirim'),
(128, '081382690461', 'cie cie', '2017-06-13 12:52:02', 'terkirim'),
(129, '081382690461', 'cie cie', '2017-06-13 12:52:04', 'terkirim'),
(130, '081382690461', 'cie cie', '2017-06-13 12:52:14', 'terkirim'),
(131, '081382690461', 'cie cie', '2017-06-13 12:52:16', 'terkirim'),
(132, '081382690461', 'cie cie', '2017-06-13 12:52:18', 'terkirim'),
(133, '081382690461', 'cie cie', '2017-06-13 12:52:20', 'terkirim'),
(134, '081382690461', 'cie cie', '2017-06-13 12:52:22', 'terkirim'),
(135, '081382690461', 'cie cie', '2017-06-13 12:52:24', 'terkirim'),
(136, '081382690461', 'cie cie', '2017-06-13 12:52:26', 'terkirim'),
(137, '081382690461', 'cie cie', '2017-06-13 12:52:28', 'terkirim'),
(138, '081382690461', 'cie cie', '2017-06-13 12:52:30', 'terkirim'),
(139, '081382690461', 'cie cie', '2017-06-13 12:52:32', 'terkirim'),
(140, '081382690461', 'cie cie', '2017-06-13 12:52:34', 'terkirim');

-- --------------------------------------------------------

--
-- Table structure for table `warga`
--

CREATE TABLE `warga` (
  `id` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `alamat` text NOT NULL,
  `nomor` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `warga`
--

INSERT INTO `warga` (`id`, `nama`, `alamat`, `nomor`) VALUES
(5, 'Risnawan', 'wkwkwkwk land', '081382690461'),
(6, 'Linda', 'Bogor', '081291537743'),
(7, 'Heraldy', 'Depok', '087783874051'),
(8, 'Anida', 'Depok 2', '085781331663'),
(9, 'Bhakti', 'Cibubur', '083890934438'),
(38, 'Risnawan 1', ' Cikago 1 ', '083895622226\r'),
(39, 'Risnawan 2', ' Cikago 2 ', '083895622226\r'),
(40, 'Risnawan 3', ' Cikago 3 ', '083895622226\r'),
(41, 'Risnawan 4', ' Cikago 4 ', '083895622226');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `gempa`
--
ALTER TABLE `gempa`
  ADD PRIMARY KEY (`id_gempa`);

--
-- Indexes for table `pesan`
--
ALTER TABLE `pesan`
  ADD PRIMARY KEY (`id_pesan`);

--
-- Indexes for table `warga`
--
ALTER TABLE `warga`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `gempa`
--
ALTER TABLE `gempa`
  MODIFY `id_gempa` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `pesan`
--
ALTER TABLE `pesan`
  MODIFY `id_pesan` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=141;
--
-- AUTO_INCREMENT for table `warga`
--
ALTER TABLE `warga`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
