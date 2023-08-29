#!/bin/bash
# 检查内存，CPU及硬盘的使用率
MEMORY=$(free -m | awk 'NR==2{printf "%.2f%%", $3*100/$2 }')
CPU=$(top -n 1 | grep %Cpu\(s\) | awk '{printf "%.2f%%",100-$8}')
DISK=$(df -lh | awk '{ if ( $6 == "/") print $5 }')
echo "内存使用率: ${MEMORY}, CPU使用率: ${CPU},磁盘使用率: ${DISK}"
