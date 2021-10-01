def computation():
    a = range(int(1e6))
    b = range(int(1e6))
    result = 0
    for x, y in zip(a, b):
        result += x + y
    return result


def function1():
    function2()
    function3()


def function2():
    for _ in range(50):
        computation()


def function3():
    computation()


def main():
    function1()


if __name__ == '__main__':
    main()