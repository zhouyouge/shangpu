<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript" src="../../statics/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../../js/tubiao/echarts2.js"></script>
<script>
    $(function () {
        var myChart=echarts.init(document.getElementById("tubiao"));
        var weatherIcons = {
            'Sunny':'011.png',
            'Cloudy':'012.png',
            'Showers':'013.png'
        };
        option = {
            title: {
                text: '分场下所有摊位统计',
                subtext: '分场数据',
                left: 'center'
            },
            tooltip: {
                trigger: 'item',
                formatter: '{a} <br/>{b} : {c} ({d}%)'
            },
            legend: {
                // orient: 'vertical',
                // top: 'middle',
                bottom: 10,
                left: 'center',
                data: ['洛阳分场', '三门峡分场', '郑州分场', '渑池分场', '义马分场']
            },
            series: [
                {
                    type: 'pie',
                    radius: '65%',
                    center: ['50%', '50%'],
                    selectedMode: 'single',
                    data: [
                        {
                            value: 535,
                            name: '    洛阳分场',
                            label: {
                                formatter: [
                                    '{title|{b}}{abg|}',
                                    '  {weatherHead|楼栋}{valueHead|总数}{rateHead|占比}',
                                    '{hr|}',
                                    '  {Sunny|}{value|1000}{rate|55.3%}',
                                    '  {Cloudy|}{value|1000}{rate|38.9%}',
                                    '  {Showers|}{value|1000}{rate|5.8%}'
                                ].join('\n'),
                                backgroundColor: '#eee',
                                borderColor: '#777',
                                borderWidth: 1,
                                borderRadius: 4,
                                rich: {
                                    title: {
                                        color: '#eee',
                                        align: 'center'
                                    },
                                    abg: {
                                        backgroundColor: '#333',
                                        width: '100%',
                                        align: 'right',
                                        height: 25,
                                        borderRadius: [4, 4, 0, 0]
                                    },
                                    Sunny: {
                                        height: 30,
                                        align: 'left',
                                        backgroundColor: {
                                            image: weatherIcons.Sunny
                                        }
                                    },
                                    Cloudy: {
                                        height: 30,
                                        align: 'left',
                                        backgroundColor: {
                                            image: weatherIcons.Cloudy
                                        }
                                    },
                                    Showers: {
                                        height: 30,
                                        align: 'left',
                                        backgroundColor: {
                                            image: weatherIcons.Showers
                                        }
                                    },
                                    weatherHead: {
                                        color: '#333',
                                        height: 24,
                                        align: 'left'
                                    },
                                    hr: {
                                        borderColor: '#777',
                                        width: '100%',
                                        borderWidth: 0.5,
                                        height: 0
                                    },
                                    value: {
                                        width: 20,
                                        padding: [0, 20, 0, 30],
                                        align: 'left'
                                    },
                                    valueHead: {
                                        color: '#333',
                                        width: 20,
                                        padding: [0, 20, 0, 30],
                                        align: 'center'
                                    },
                                    rate: {
                                        width: 40,
                                        align: 'right',
                                        padding: [0, 10, 0, 0]
                                    },
                                    rateHead: {
                                        color: '#333',
                                        width: 40,
                                        align: 'center',
                                        padding: [0, 10, 0, 0]
                                    }
                                }
                            }
                        },
                        {value: 535, name: '洛阳分场'},
                        {value: 510, name: '三门峡分场'},
                        {value: 634, name: '郑州分场'},
                        {value: 735, name: '渑池分场'},
                        {value: 735, name: '义马分场'}
                    ],
                    emphasis: {
                        itemStyle: {
                            shadowBlur: 10,
                            shadowOffsetX: 0,
                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                        }
                    }
                }
            ]
        };
        myChart.setOption(option);
        window.onresize=function(){
            myChart.resize();
        };
    });
</script>
<html>
<head>
    <style>
        #tubiao{
            width: 100%;
            height: 500px;
            border: 1px #0a6999 solid;
        }
    </style>
    <title>Title</title>
</head>
<body>
<div  id="tubiao" ></div>
</body>
</html>
