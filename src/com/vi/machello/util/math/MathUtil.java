/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vi.machello.util.math;

import com.google.common.base.Objects;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
 
/**
 *
 * @author Kyle D. Williams
 */
public final class MathUtil {

    private MathUtil() {
    }

    /**
     * Modulo Fix for negative numbers
     *
     * @param dividend the number that is being divided by. Appears on Left
     * @param divisor the number the dividend is being divided by. Appears on
     * Right
     * @return
     */
    public static int modulo(int dividend, int divisor) {
        return (dividend % divisor + divisor) % divisor;
    }

    /**
     *
     * @param <V>
     * @param vc
     * @param vector
     * @return
     */
    public static <V extends Vector3fPiece> Vector3f pieceToVec(V vc, Vector3f vector) {
        vector = Objects.firstNonNull(vector, new Vector3f());
        vector.set(vc.getX(), vc.getY(), vc.getZ());
        return vector;
    }

    /**
     *
     * @param <Q>
     * @param qc
     * @param quaternion
     * @return
     */
    public static <Q extends QuaternionPiece> Quaternion pieceToQuat(Q qc, Quaternion quaternion) {
        quaternion = Objects.firstNonNull(quaternion, new Quaternion());
        quaternion.set(qc.getX(), qc.getY(), qc.getZ(), qc.getW());
        return quaternion;
    }
}
